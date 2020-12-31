SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "941d03d2389b0eb091738b4f0ff5e365"
SRC_URI[sha256sum] = "c729845434366216d320e936b8ad6f9d681aab72dc7cbc2d51bedc3582f3ad1e"

inherit pypi
inherit setuptools3
inherit native
