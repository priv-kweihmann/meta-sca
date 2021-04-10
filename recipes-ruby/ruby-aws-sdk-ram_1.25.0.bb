SUMMARY = "RubyGem: aws-sdk-ram"
DESCRIPTION = "Official AWS Ruby gem for AWS Resource Access Manager (RAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "769a5e9f82d5e5ff04fa4ae2e4f84058"
SRC_URI[sha256sum] = "a2a09fa4ba03d41c4da0baf317f7ba9e64cc897640fc930175dba848007802b6"

GEM_NAME = "aws-sdk-ram"

inherit rubygems
