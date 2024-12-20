SUMMARY = "A flake8 plugin which checks for use of platform specific strftime codes"
HOMEPAGE = "https://github.com/python-formate/flake8_strftime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=173e265509341289099e4c131decb545"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
DEPENDS += "\
    nativesdk-python3-flake8 \
    python3-whey-native \
"

SRC_URI[sha256sum] = "db6b641a6c4562285d879d595481c612893bb8729d96ef4da356583c38a1013f"

inherit pypi
inherit pypi-old
inherit python_pep517
inherit python3native
inherit setuptools3-base
inherit_defer nativesdk

python_pep517_do_compile () {
    nativepython3 -m whey --out-dir ${PEP517_WHEEL_PATH} --wheel ${PEP517_BUILD_OPTS} ${PEP517_SOURCE_PATH}
}

do_install:append() {
    # mimic the not yet merged upstream patch to gain flake8 5.x compat
    find ${D} -type f -exec sed -i "s#STRFTIME#SFT#g" {} +
}

PYPI_PACKAGE = "flake8-strftime"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
