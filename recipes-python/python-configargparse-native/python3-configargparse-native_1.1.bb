SUMMARY = "A drop-in replacement for argparse."
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables. "
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "7a4671b43de35aa37b8beb061ebfa4ee"
SRC_URI[sha256sum] = "7971cdb14328baaada0f140832925de83ecee93ac5e67e587e3476fac283ad51"
