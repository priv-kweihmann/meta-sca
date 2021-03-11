SUMMARY = "RubyGem: aws-sdk-shield"
DESCRIPTION = "Official AWS Ruby gem for AWS Shield"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4cddee61c9fa84d81bbd720f4c2aa81a"
SRC_URI[sha256sum] = "89c24b335d9417bf67653f27539d0c626755777573f95ba172a25de601d42b9f"

GEM_NAME = "aws-sdk-shield"

inherit rubygems
