SUMMARY = "Python AST read/write"
HOMEPAGE = "https://github.com/berkerpeksag/astor"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=561205fdabc3ec52cae2d30815b8ade7"

SRC_URI[md5sum] = "83ab4ee6598f0381d94ed6949a6d6da2"
SRC_URI[sha256sum] = "6a6effda93f4e1ce9f618779b2dd1d9d84f1e32812c23a29b3fff6fd7f63fa5e"

PYPI_PACKAGE = "astor"

inherit pypi
inherit setuptools3
inherit native
