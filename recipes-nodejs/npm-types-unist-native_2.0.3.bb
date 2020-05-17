SUMMARY = "NPM: @types/unist"
DESCRIPTION = "TypeScript definitions for non-npm package Unist"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

SRC_URI = "https://registry.npmjs.org/@types/unist/-/unist-2.0.3.tgz"
SRC_URI[md5sum] = "ff3dada2adb2959c3476d8421d4143bf"
SRC_URI[sha256sum] = "303afc6fbf562b6fd3daa5a5f022df42e9cbee11c409e4ca4be459ce7993fca4"

NPM_PKGNAME = "@types/unist"

inherit npmhelper
inherit native

S = "${WORKDIR}/unist"
