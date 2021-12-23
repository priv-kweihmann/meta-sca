SUMMARY = "An ISO 8601 date/time/duration parser and formatter"
HOMEPAGE = "https://github.com/gweis/isodate/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://setup.py;beginline=2;endline=27;md5=a0de0126e2ca03c5e0bcbadc70fd84e3"

PYPI_PACKAGE = "isodate"

SRC_URI[md5sum] = "1a310658b30a48641bafb5652ad91c40"
SRC_URI[sha256sum] = "48c5881de7e8b0a0d648cb024c8062dc84e7b840ed81e864c7614fd3c127bde9"

inherit pypi
inherit setuptools3
inherit native
