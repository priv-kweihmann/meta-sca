SUMMARY = "A python package that provides useful locks"
HOMEPAGE = "https://github.com/harlowja/fasteners"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4476c4be31402271e101d9a4a3430d52"

PYPI_PACKAGE = "fasteners"

SRC_URI[md5sum] = "dd412feb9e6a7e5d167810016b85ac2b"
SRC_URI[sha256sum] = "55dce8792a41b56f727ba6e123fcaee77fd87e638a6863cec00007bfea84c8d8"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
