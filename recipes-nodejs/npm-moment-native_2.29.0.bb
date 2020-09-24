SUMMARY = "NPM: moment"
DESCRIPTION = "Parse, validate, manipulate, and display dates"
HOMEPAGE = "https://momentjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/moment/-/moment-2.29.0.tgz"
SRC_URI[md5sum] = "978bcc449af950fccfc82ae65f094bd6"
SRC_URI[sha256sum] = "fb136cd28d8616a7d96d9c484900814f352cdcef979180a155fbf13b26cf3779"

NPM_PKGNAME = "moment"

inherit npmhelper
inherit native
