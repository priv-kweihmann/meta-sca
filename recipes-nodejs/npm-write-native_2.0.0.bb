SUMMARY = "NPM: write"
DESCRIPTION = "Write data to a file, replacing the file if it already exists and creating any intermediate directories if they don't already exist. Thin wrapper around node's native fs methods."
HOMEPAGE = "https://github.com/jonschlinkert/write"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b"

DEPENDS = "npm-add-filename-increment-native"

SRC_URI = "https://registry.npmjs.org/write/-/write-2.0.0.tgz"
SRC_URI[md5sum] = "4a505bcc7adb76ca75c9b9b132f3c8ad"
SRC_URI[sha256sum] = "972b78037d12cb47fa7a789cb1c29d1d725000120712212728267425e4dea31b"

NPM_PKGNAME = "write"

inherit npmhelper
inherit native
