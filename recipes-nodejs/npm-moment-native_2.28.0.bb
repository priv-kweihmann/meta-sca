SUMMARY = "NPM: moment"
DESCRIPTION = "Parse, validate, manipulate, and display dates"
HOMEPAGE = "https://momentjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/moment/-/moment-2.28.0.tgz"
SRC_URI[md5sum] = "2dcb2d3ad0ccbaafe51db674a462b95a"
SRC_URI[sha256sum] = "d2e6ae08c3cedc5a7c11cd98f60194fa58d65b40a0d0f34106ecfdb8385ed737"

NPM_PKGNAME = "moment"

inherit npmhelper
inherit native
