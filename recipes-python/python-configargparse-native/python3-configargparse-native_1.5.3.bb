SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables"
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

SRC_URI[md5sum] = "33bef8918c8946e6a9e4dcaa74eb7ab8"
SRC_URI[sha256sum] = "1b0b3cbf664ab59dada57123c81eff3d9737e0d11d8cf79e3d6eb10823f1739f"

inherit pypi
inherit setuptools3
inherit native
