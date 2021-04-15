SUMMARY = "RubyGem: inspec"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://lib/plugins/inspec-init/templates/profiles/gcp/inspec.yml;beginline=6;endline=6;md5=cfb5ff7823bc166fac8853e293b76fd7"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-faraday-middleware \
                  ruby-inspec-core \
                  ruby-train \
                  ruby-train-aws \
                  ruby-train-habitat \
                  ruby-train-winrm"

SRC_URI[md5sum] = "27923b4a647807aaff94dff9a419bec5"
SRC_URI[sha256sum] = "91a13e41edc657beef7d5bfe0ccbedd9ed51b1d849aab0f548dc129b7a3a8377"

GEM_NAME = "inspec"

inherit rubygems
