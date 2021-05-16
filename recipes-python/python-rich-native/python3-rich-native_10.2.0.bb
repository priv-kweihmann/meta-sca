SUMMARY = "Render rich text, tables, progress bars, syntax highlighting"
HOMEPAGE = "https://github.com/willmcgugan/rich"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0d35d5357392e5bfeb0d0a7e6ba4d83"

DEPENDS += "\
            python3-colorama-native \
            python3-commonmark-native \
            python3-pygments-native \
            python3-typing-extensions-native \
           "

PYPI_PACKAGE = "rich"

SRC_URI[md5sum] = "94134950a13c323a57010e18351fde56"
SRC_URI[sha256sum] = "a30429d82363d42e7c64e324c2c8735c045f190cba609feee91a7b9f563a64b5"

inherit pypi
inherit setuptools3
inherit native
