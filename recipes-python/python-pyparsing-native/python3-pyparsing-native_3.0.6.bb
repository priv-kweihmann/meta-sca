SUMMARY = "Python parsing module"
HOMEPAGE = "https://github.com/pyparsing/pyparsing/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=657a566233888513e1f07ba13e2f47f1"

SRC_URI = "git://github.com/pyparsing/pyparsing.git;protocol=https;branch=master"
SRCREV = "16b766b97c9c144be8c3fad4fec00417728abfa6"
UPSTREAM_CHECK_GITTAGREGEX = "pyparsing_(?P<pver>\d+\.\d+\.\d+)$"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native
