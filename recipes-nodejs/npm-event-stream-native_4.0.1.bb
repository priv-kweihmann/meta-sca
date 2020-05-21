SUMMARY = "NPM: event-stream"
DESCRIPTION = "construct pipes of streams of events"
HOMEPAGE = "http://github.com/dominictarr/event-stream"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f"

DEPENDS = "npm-duplexer-native \
           npm-from-native \
           npm-map-stream-native \
           npm-pause-stream-native \
           npm-split-native \
           npm-stream-combiner-native \
           npm-through-native"

SRC_URI = "https://registry.npmjs.org/event-stream/-/event-stream-4.0.1.tgz"
SRC_URI[md5sum] = "82433cb9e456e90c8e691731e3564d63"
SRC_URI[sha256sum] = "90002803c7130adc76bf4c7c263adb9164dc6cb0b0eca2f9e82b78b927e583dd"

NPM_PKGNAME = "event-stream"

inherit npmhelper
inherit native
