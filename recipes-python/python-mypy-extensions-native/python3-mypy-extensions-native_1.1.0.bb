SUMMARY = "Type system extensions for programs checked with the mypy typechecker"
HOMEPAGE = "http://www.mypy-lang.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0fe3219e2470a78c0d1837019b8b426e"

PYPI_PACKAGE = "mypy-extensions"

SRC_URI[md5sum] = "f59bfd7f9dca73f36c8feed12f9e8eba"
SRC_URI[sha256sum] = "52e68efc3284861e772bbcd66823fde5ae21fd2fdb51c62a211403730b916558"


inherit pypi
inherit pypi-old
inherit python_flit_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"