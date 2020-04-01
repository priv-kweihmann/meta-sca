SUMMARY = "The official binary distribution format for Python"
HOMEPAGE = "https://github.com/pypa/wheel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9d66b41bc2a080e7174acc5dffecd752"

PYPI_PACKAGE = "wheel"

SRC_URI[md5sum] = "7aac11026bffef3696e04286208a4493"
SRC_URI[sha256sum] = "10c9da68765315ed98850f8e048347c3eb06dd81822dc2ab1d4fde9dc9702646"

inherit pypi
inherit setuptools3
inherit native
