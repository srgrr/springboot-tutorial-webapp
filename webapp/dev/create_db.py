import argparse
import mysql.connector


class Connection(object):
  def __init__(self, db_url, db_port, db_user, db_pass):
    self.db_url = db_url
    self.db_port = db_port
    self.db_user = db_user
    self.db_pass = db_pass

  def get_connection(self):
    return mysql.connector.connect(
      host=self.db_url,
      port=self.db_port,
      user=self.db_user,
      password=self.db_pass
    )


def parse_args():
  parser = argparse.ArgumentParser()
  parser.add_argument("--db-url", type=str)
  parser.add_argument("--db-port", type=int)
  parser.add_argument("--db-user", type=str)
  parser.add_argument("--db-pass", type=str)
  return parser.parse_args()


def main(db_url, db_port, db_user, db_pass):
  conn = \
    Connection(db_url, db_port, db_user, db_pass).get_connection()
  cursor = conn.cursor()
  cursor.execute("CREATE DATABASE IF NOT EXISTS example")
  cursor.execute("USE example")
  cursor.execute("CREATE TABLE IF NOT EXISTS PERSON (ID_CARD varchar(256), FULL_NAME varchar(256))")


if __name__ == "__main__":
  opts = parse_args()
  main(**vars(opts))
