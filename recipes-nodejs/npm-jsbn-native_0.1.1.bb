SUMMARY = "NPM: jsbn"
DESCRIPTION = "The jsbn library is a fast, portable implementation of large-number math in pure JavaScript, enabling public-key crypto and other applications on desktop and mobile browsers."
HOMEPAGE = "https://github.com/andyperlitch/jsbn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6ea389b6b52325149beeec27075c5ac"

SRC_URI = "https://registry.npmjs.org/jsbn/-/jsbn-0.1.1.tgz"
SRC_URI[md5sum] = "5d011f0d46641e263915879febada330"
SRC_URI[sha256sum] = "5ac44bc9490a2d7da45ebb7028ff9b86bf17944741e7c449573d7a147ae72323"

S = "${WORKDIR}/package"

NPM_PKGNAME = "jsbn"

inherit npmhelper
inherit native
