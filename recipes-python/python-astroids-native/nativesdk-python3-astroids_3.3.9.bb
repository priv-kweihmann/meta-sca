SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a70cf540abf41acb644ac3b621b2fad1"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-pylazy-object-proxy \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-wrapt \
    python3-pytest-runner-native \
"

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "ca20a247e15cfcafcee493bab9a50975"
SRC_URI[sha256sum] = "622cc8e3048684aa42c820d9d218978021c3c3d174fb03a9f0d615921744f550"

do_configure:prepend() {
    # remove the version pinning on build tools
    # jeez some projects need to be make it even more complicated than
    # it needs to be
    sed -i "s#setuptools~=#setuptools>=#g" ${S}/pyproject.toml
    sed -i "s#wheel~=#wheel>=#g" ${S}/pyproject.toml
}

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-math \
    nativesdk-python3-misc \
    nativesdk-python3-pprint \
    nativesdk-python3-pylazy-object-proxy \
    nativesdk-python3-pytest \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-wrapt \
"
