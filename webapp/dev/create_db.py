import argparse
import mysql


class Connection(object):
  def __init__(db_url, db_user, db_pass):
    self.db_url = db_url
    self.db_user = db_user
    self.db_pass = db_pass

  @property
  def conn(self):
    pass

  def run_trx(self, query):
    pass


def parse_args():
  parser = argparse.ArgumentParser()
  parser.add_argument("--db-url")
  parser.add_argument("--db-user")
  parser.add_argument("--db-pass")
  return parser.parse_args()


def main(db_url, db_user, db_pass):
  conn = Connection(db_url, db_user, db_pass)
  conn.run_trx("CREATE TABLE 1")


if __name__ == "__main__":
  main(**vars(opts))
