SUMMARY = "RubyGem: wisper"
DESCRIPTION = "A micro library providing objects with Publish-Subscribe capabilities.    Both synchronous (in-process) and asynchronous (out-of-process) subscriptions are supported.    Check out the Wiki for articles, guides and examples: https://github.com/krisleech/wisper/wiki"
HOMEPAGE = "https://github.com/krisleech/wisper"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=348;endline=370;md5=a89e7f76c3931794071d3def079169b7"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "d37a95462b8c7261c4de6158dcca653d"
SRC_URI[sha256sum] = "ce17bc5c3a166f241a2e6613848b025c8146fce2defba505920c1d1f3f88fae6"

GEM_NAME = "wisper"

inherit rubygems
