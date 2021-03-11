SUMMARY = "Python parsing module"
HOMEPAGE = "https://github.com/pyparsing/pyparsing/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=657a566233888513e1f07ba13e2f47f1"

SRC_URI = "git://github.com/pyparsing/pyparsing.git;protocol=https;branch=pyparsing_2.4.x"
SRCREV = "6a844ee35ca5125490a28dbd6dd2d15b6498e605"
UPSTREAM_CHECK_GITTAGREGEX = "pyparsing_(?P<pver>\d+\.\d+\.\d+)"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN}_class-target += "\
    ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-debugger \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-pprint \
    ${PYTHON_PN}-stringold \
    ${PYTHON_PN}-threading \
"

BBCLASSEXTEND = "native"
