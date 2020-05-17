SUMMARY = "NPM: limit-spawn"
DESCRIPTION = "Kills a child process created with spawn after X bytes are sent"
HOMEPAGE = "https://github.com/alessioalex/limit-spawn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=176f49adca8b0da8a7dde6810631de42"

SRC_URI = "https://registry.npmjs.org/limit-spawn/-/limit-spawn-0.0.3.tgz"
SRC_URI[md5sum] = "a4a869d06a79a096688b0b1dc8673568"
SRC_URI[sha256sum] = "c7ee7681fd498d1c7826baab1fe85906145881f42f75d3580202e35e0fa64dda"

NPM_PKGNAME = "limit-spawn"

inherit npmhelper
inherit native
