SUMMARY = "RubyGem: concurrent-ruby"
DESCRIPTION = "Modern concurrency tools including agents, futures, promises, thread pools, actors, supervisors, and more.Inspired by Erlang, Clojure, Go, JavaScript, actors, and classic concurrency patterns."
HOMEPAGE = "http://www.concurrent-ruby.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e319104fe1435b64fc0a67032db44f02"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "3558ccacd1371bf34a43ba82b79bc5cc"
SRC_URI[sha256sum] = "ff4befc88d522ccb2109596da26309f4b0b041683ca62d3cb903b313e1caddee"

GEM_NAME = "concurrent-ruby"

inherit rubygems
