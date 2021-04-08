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

SRC_URI[md5sum] = "0f6c48b0152289ced455bb5095ca2dfc"
SRC_URI[sha256sum] = "15955f6fb7e0db4959ad90caf30a7a4cb601a66d8939e9f354fc8cadd59ff394"

GEM_NAME = "inspec"

inherit rubygems
