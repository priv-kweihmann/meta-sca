SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables"
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

SRC_URI[md5sum] = "237b76876efaf3d6d51b3cc4b97c30ca"
SRC_URI[sha256sum] = "abef9ff44fb0091f0e3bb2ee7e5b26a02b5b62d45408a5272a9bd461f5b59b4b"

inherit pypi
inherit setuptools3
inherit native
