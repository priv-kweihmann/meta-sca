SUMMARY = "flake8 debug statement checker"
HOMEPAGE = "https://github.com/jbkahn/flake8-debugger"

LICENSE = "MIT"
## No license in repo & package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "flake8-debugger"

DEPENDS += "${PYTHON_PN}-flake8-native"

SRC_URI[md5sum] = "05a669ccd439cd9f80ddbc79ef4a51ec"
SRC_URI[sha256sum] = "712d7c1ff69ddf3f0130e94cc88c2519e720760bce45e8c330bfdcb61ab4090d"

inherit pypi
inherit native
inherit setuptools3
