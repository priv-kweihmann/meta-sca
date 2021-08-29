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

SRC_URI[md5sum] = "ed25d5d04113313ae8633b8b52e3853a"
SRC_URI[sha256sum] = "4010222215d7c6e3ae75442c1395c7a6a36b803603e21290f5e1c0651695ee3f"

inherit pypi
inherit setuptools3
inherit native
