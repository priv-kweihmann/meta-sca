SUMMARY = "Parse Ruby Gemfile, .gemspec and Cocoapod .podspec files using Python"
HOMEPAGE = "https://github.com/gemfileparser/gemfileparser"

LICENSE = "MIT | GPLv3"
LIC_FILES_CHKSUM = "\
                    file://LICENSE.MIT;md5=c3b5d8f6969b92fe92ce8aa3d3f80b3c \
                    file://LICENSE.GPLv3;md5=e61862b38a9103ecb71fd9f79feaff69 \
                   "

PYPI_PACKAGE = "gemfileparser"

SRC_URI[md5sum] = "670b8e9dbbfa7a27f06b5de5a84b855b"
SRC_URI[sha256sum] = "839592e49ea3fd985cec003ef58f8e77009a69ed7644a0c0acc94cf6dd9b8d6e"

inherit pypi
inherit setuptools3
inherit native
