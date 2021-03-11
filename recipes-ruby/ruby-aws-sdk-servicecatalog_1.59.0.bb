SUMMARY = "RubyGem: aws-sdk-servicecatalog"
DESCRIPTION = "Official AWS Ruby gem for AWS Service Catalog"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "806abfe2b7a916c6672e8919c8a7054a"
SRC_URI[sha256sum] = "dc1e2974788fc9d52c457e21687812c55314dfe0d8f0823ad337d386ee8b8d8f"

GEM_NAME = "aws-sdk-servicecatalog"

inherit rubygems
