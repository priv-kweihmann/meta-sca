SUMMARY = "Pretty print the output of python stdlib ast.parse"
HOMEPAGE = "https://github.com/asottile/astpretty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5fd324061c581b8d45b8cb18c560a543"

SRC_URI[md5sum] = "1662249b14062576b5506440f995af3b"
SRC_URI[sha256sum] = "e4724bfd753636ba4a84384702e9796e5356969f40af2596d846ce64addde086"

PYPI_PACKAGE = "astpretty"

inherit pypi
inherit native
inherit setuptools3
