SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
HOMEPAGE = "https://github.com/nexb/python-publicsuffix2"

LICENSE = "MIT & MPL-2.0"
LIC_FILES_CHKSUM = "file://publicsuffix2.LICENSE;md5=18f95bf99d093deb07ba194bbf6c64d2"

DEPENDS += "python3-requests-native"

PYPI_PACKAGE = "publicsuffix2"

SRC_URI[md5sum] = "6983c3a76459487056aa1334d174d6de"
SRC_URI[sha256sum] = "00f8cc31aa8d0d5592a5ced19cccba7de428ebca985db26ac852d920ddd6fe7b"

inherit pypi
inherit setuptools3
inherit native
