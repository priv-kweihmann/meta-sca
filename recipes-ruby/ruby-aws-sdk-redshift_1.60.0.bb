SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "719c90abf2891ef66b9615b63d12c934"
SRC_URI[sha256sum] = "6705c16a8f41a809441906ca524775fb5636b8b30134149f863ee5f7d32c7a54"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
