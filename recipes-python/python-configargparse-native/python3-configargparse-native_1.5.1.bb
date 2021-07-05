SUMMARY = "A drop-in replacement for argparse"
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables"
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

PYPI_PACKAGE = "ConfigArgParse"

SRC_URI[md5sum] = "18d022ab19911dbe13000b23690f383d"
SRC_URI[sha256sum] = "371f46577e76ec71a183b88378f36dd09f4b946f60fe60712f411b020f26b812"

inherit pypi
inherit setuptools3
inherit native
