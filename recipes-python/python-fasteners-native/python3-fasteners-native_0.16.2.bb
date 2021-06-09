SUMMARY = "A python package that provides useful locks"
HOMEPAGE = "https://github.com/harlowja/fasteners"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4476c4be31402271e101d9a4a3430d52"

PYPI_PACKAGE = "fasteners"

SRC_URI[md5sum] = "dcc86737f47f7e8da4ec21f466fe90dd"
SRC_URI[sha256sum] = "2fa2ca17a4fa0510ff63e0a091ab58fdd1bcdbab82e08d4e449b85ff086fa68e"

inherit pypi
inherit setuptools3
inherit native
