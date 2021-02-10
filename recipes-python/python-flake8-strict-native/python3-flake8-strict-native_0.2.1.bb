SUMMARY = "Flake8 plugin that checks Python code against a set of opinionated style rules"
HOMEPAGE = "https://github.com/smarkets/flake8-strict"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6ceb86d5d9e2cc99e949bd8ec58dba3"

DEPENDS += "\
            python3-black-native \
            python3-enum-compat-native \
            python3-flake8-native \
           "

SRC_URI = "git://github.com/smarkets/flake8-strict.git;protocol=https"
SRCREV = "7c40ad30ecb6d8a31ac384ed49bb8107cfd5023e"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native
