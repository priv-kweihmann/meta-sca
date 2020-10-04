SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "6b90dd55851a8ccb3a19fe2cb82cb82f"
SRC_URI[sha256sum] = "ba040c24d20aa302f78f4747df549573ae1eaf8e1084269199154da9c483f07f"

inherit pypi
inherit setuptools3
inherit native
