SUMMARY = "a little orm"
HOMEPAGE = "https://github.com/coleifer/peewee/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a68e3ec7a6e09a43370f0a3fbc48660"

PYPI_PACKAGE = "peewee"

SRC_URI[md5sum] = "04cd0ac8d9d727533a6a99e52ad67bc0"
SRC_URI[sha256sum] = "01bd7f734defb08d7a3346a0c0ca7011bc8d0d685934ec0e001b3371d522ec53"

export NO_SQLITE = "1"

inherit pypi
inherit setuptools3
inherit native
