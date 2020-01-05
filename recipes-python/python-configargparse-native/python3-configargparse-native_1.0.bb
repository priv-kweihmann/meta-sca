SUMMARY = "A drop-in replacement for argparse."
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables. "
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "4e6063dadbe4b44a8af5b79d1896136a"
SRC_URI[sha256sum] = "bf378245bc9cdc403a527e5b7406b991680c2a530e7e81af747880b54eb57133"
