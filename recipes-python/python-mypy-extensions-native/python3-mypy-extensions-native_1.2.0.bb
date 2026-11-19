SUMMARY = "Type system extensions for programs checked with the mypy typechecker"
HOMEPAGE = "http://www.mypy-lang.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0fe3219e2470a78c0d1837019b8b426e"

PYPI_PACKAGE = "mypy-extensions"

SRC_URI[md5sum] = "25d0c46efc1c271fd976944f6e66a3e2"
SRC_URI[sha256sum] = "c6e275a07f1c2fc096b62940452d0eaa3f3af7de45d704787866240a7c6d5a51"


inherit pypi
inherit pypi-old
inherit python_flit_core
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"