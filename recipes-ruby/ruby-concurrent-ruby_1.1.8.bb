SUMMARY = "RubyGem: concurrent-ruby"
DESCRIPTION = "Modern concurrency tools including agents, futures, promises, thread pools, actors, supervisors, and more.Inspired by Erlang, Clojure, Go, JavaScript, actors, and classic concurrency patterns."
HOMEPAGE = "http://www.concurrent-ruby.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e319104fe1435b64fc0a67032db44f02"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "68c226f3ee1bf39313dd4ebc0cf52d43"
SRC_URI[sha256sum] = "e35169e8e01c33cddc9d322e4e793a9bc8c3c00c967d206d17457e0d301f2257"

GEM_NAME = "concurrent-ruby"

inherit rubygems
