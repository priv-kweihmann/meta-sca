SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a70cf540abf41acb644ac3b621b2fad1"

DEPENDS += "\
    python3-native \
    python3-pylazy-object-proxy-native \
    python3-pytest-runner-native \
    python3-typed-ast-native \
    python3-typing-extensions-native \
    python3-wrapt-native \
"

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "75c5ffd8edd0d2d74a6407db704a2e20"
SRC_URI[sha256sum] = "ac248253bfa4bd924a0de213707e7ebeeb3138abeb48d798784ead1e56d419d4"

do_configure:prepend() {
    # remove the version pinning on build tools
    # jeez some projects need to be make it even more complicated than
    # it needs to be
    sed -i "s#setuptools~=#setuptools>=#g" ${S}/pyproject.toml
    sed -i "s#wheel~=#wheel>=#g" ${S}/pyproject.toml
}

inherit pypi
inherit python_setuptools_build_meta
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-math \
    nativesdk-python3-misc \
    nativesdk-python3-pprint \
    nativesdk-python3-pylazy-object-proxy \
    nativesdk-python3-pytest \
    nativesdk-python3-typed-ast \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-wrapt \
"
