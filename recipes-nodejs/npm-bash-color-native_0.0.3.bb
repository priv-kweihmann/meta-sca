SUMMARY = "NPM: bash-color"
DESCRIPTION = "a simple tool for wrapping strings in bash color codes. Used to color console output."


LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://registry.npmjs.org/bash-color/-/bash-color-0.0.3.tgz"
SRC_URI[md5sum] = "06bef8394afe5f7dcfa863ec63f02076"
SRC_URI[sha256sum] = "e137d11502de0a437a1736c8a3888458de86068b3a8863cbea1721eaec40ef12"

NPM_PKGNAME = "bash-color"

inherit npmhelper
inherit native
