SUMMARY = "RubyGem: aws-sdk-ssm"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Systems Manager (SSM) (Amazon SSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f78392976b9eae3900c6012844339e99"
SRC_URI[sha256sum] = "17cc3d17cd4720cf561d8efdca7fcee92f7f9121bdba50a9422ad3bc1113a173"

GEM_NAME = "aws-sdk-ssm"

inherit rubygems
