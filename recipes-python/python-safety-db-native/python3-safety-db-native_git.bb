SUMMARY = "Safety DB is a database of known security vulnerabilities in Python packages"
HOMEPAGE = "https://github.com/pyupio/safety-db"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "CC-BY-NC-4.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=71dfde19e73eeb27e55a05b6a729ab58"

SRC_URI = "git://github.com/pyupio/safety-db.git;branch=master;protocol=https"
SRCREV = "f7da69d3609730f33cb9d6c66ae3a30e463bdb38"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

UPSTREAM_CHECK_COMMITS = "1"
