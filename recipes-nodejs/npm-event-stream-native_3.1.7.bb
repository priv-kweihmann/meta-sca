SUMMARY = "NPM: event-stream"
DESCRIPTION = "construct pipes of streams of events"
HOMEPAGE = "http://github.com/dominictarr/event-stream"

DEPENDS = "npm-duplexer-native npm-from-native npm-map-stream-native npm-pause-stream-native npm-split-native npm-stream-combiner-native npm-through-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=84ddd974e10adfabbf232e7efb7ed715"

SRC_URI = "https://registry.npmjs.org/event-stream/-/event-stream-3.1.7.tgz"
SRC_URI[md5sum] = "89888b9ab9b2fbb8f81d836a204d5643"
SRC_URI[sha256sum] = "2cfab3ffcb1c8a2252769d0dd4df69f2f80ab719db09c263d4479df8d6dec989"

NPM_PKGNAME = "event-stream"

inherit npmhelper
inherit native
