SUMMARY = "Render rich text, tables, progress bars, syntax highlighting"
HOMEPAGE = "https://github.com/willmcgugan/rich"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "\
            python3-colorama-native \
            python3-commonmark-native \
            python3-pygments-native \
            python3-typing-extensions-native \
           "

PYPI_PACKAGE = "rich"

SRC_URI[md5sum] = "5ec2e7e696ca0f87865647b2e8064e42"
SRC_URI[sha256sum] = "93d0ea3c35ecfd8703dbe52b76885e224ad8d68c7766c921c726b14b22a57b7d"

inherit pypi
inherit setuptools3
inherit native
