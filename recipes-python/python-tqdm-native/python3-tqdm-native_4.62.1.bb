SUMMARY = "Fast, Extensible Progress Meter"
HOMEPAGE = "https://github.com/tqdm/tqdm"

LICENSE = "MIT & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENCE;md5=59e4271a933d33edfe60237db377a14b"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "tqdm"

SRC_URI[md5sum] = "1d038dc7e545b3a65256c7fc556994e2"
SRC_URI[sha256sum] = "35540feeaca9ac40c304e916729e6b78045cbbeccd3e941b2868f09306798ac9"

inherit pypi
inherit setuptools3
inherit native
