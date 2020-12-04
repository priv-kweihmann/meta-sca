SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "e437064b59e693cc7c751f1ada3488a1"
SRC_URI[sha256sum] = "c54add03a464d4779ee50350231aabb971751bbf52389acbcd0149e2ea7122aa"

inherit pypi
inherit native
inherit setuptools3
