SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=572a4af76db6990f02b2d82f387ea10f"

DEPENDS += "\
    nativesdk-python3-librt \
    nativesdk-python3-mypy-extensions \
    nativesdk-python3-pathspec \
    nativesdk-python3-types-psutil \
    nativesdk-python3-types-setuptools \
    nativesdk-python3-typing-extensions \
"

SRC_URI[md5sum] = "a23b930a86aa298a97b72da06ee84084"
SRC_URI[sha256sum] = "19d88bb05303fe63f71dd2c6270daca27cb9401c4ca8255fe50d1d920e0eb9ba"

PYPI_PACKAGE = "mypy"

inherit pypi
inherit sca-description
inherit python_setuptools_build_meta
inherit_defer nativesdk

SCA_TOOL_DESCRIPTION = "mypy"

do_compile:prepend() {
    # we need to remove typing_extensions build time
    # requirement, as either this repo here
    # or python3-build or typing_extensions misses
    # out on exposing version information
    # leading to a crash while compiling
    sed -i '/typing_extensions/d' ${S}/pyproject.toml
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-difflib \
    nativesdk-python3-io \
    nativesdk-python3-json \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-mypy-extensions \
    nativesdk-python3-netclient \
    nativesdk-python3-pathspec \
    nativesdk-python3-pickle \
    nativesdk-python3-pytest \
    nativesdk-python3-shell \
    nativesdk-python3-stringold \
    nativesdk-python3-tests \
    nativesdk-python3-threading \
    nativesdk-python3-types-psutil \
    nativesdk-python3-types-setuptools \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-unittest \
"
