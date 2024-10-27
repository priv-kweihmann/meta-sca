SUMMARY = "An ISO 8601 date/time/duration parser and formatter"
HOMEPAGE = "https://github.com/gweis/isodate/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://setup.py;beginline=2;endline=27;md5=a0de0126e2ca03c5e0bcbadc70fd84e3"

PYPI_PACKAGE = "isodate"

SRC_URI[md5sum] = "5ce182fd7f6152cda19ec605b6740687"
SRC_URI[sha256sum] = "4cd1aa0f43ca76f4a6c6c0292a85f40b35ec2e43e315b59f06e6d32171a953e6"

inherit pypi
inherit setuptools3
inherit_defer native
