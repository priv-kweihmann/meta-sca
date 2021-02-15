SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables"
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

SRC_URI[md5sum] = "dafe4ef6f38a7961a42140d396827d89"
SRC_URI[sha256sum] = "0428b975ab6c48bb101ccb732e1b5cb616296e28268e032aa806f32b647a1cc1"

inherit pypi
inherit setuptools3
inherit native
